import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class PresupuestoRepository {

    private List<Presupuesto> presupuestos;
    private final String archivoDatos = "presupuesto.json";
    private final ObjectMapper objectMapper;

    public PresupuestoRepository() {
        this.presupuestos = new ArrayList<>();
        this.objectMapper = new ObjectMapper();
        cargarDatos();
    }

    public void cargarDatos() {
        try {
        File archivo = new File(archivoDatos);
         if (archivo.exists()) {
            presupuestos = objectMapper.readValue(archivo, new TypeReference<List<Presupuesto>>() {});
        } else {
            presupuestos = new ArrayList<>();
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public void guardarDatos() {
    try {
        objectMapper.writeValue(new File(archivoDatos), presupuestos);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public Optional<Presupuesto> obtenerById(Integer id) {
    return presupuestos.stream()
            .filter(presupuesto -> presupuesto.getId() == id)
            .findFirst();
}

public List<Presupuesto> listar() {
    return presupuestos;
}

public boolean agregarGasto(Integer presupuestoId, Gasto gasto) {
    Optional<Presupuesto> presupuestoOpt = obtenerById(presupuestoId);
    if (presupuestoOpt.isPresent()) {
        Presupuesto presupuesto = presupuestoOpt.get();
        presupuesto.getGastos().add(gasto); 
        guardarDatos(); 
        return true;
    }
    return false;
 }
}