/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitnesspower.bl;

import fitnesspower.ent.Novedad;
import fitnesspowerdat.CreateFitness;
import java.sql.SQLException;

/**
 *
 * @author HIJOS
 */
public class NovedadesBL {

    CreateFitness createFitness;
    Novedad novedad;

    public void NovedadNueva(Novedad novedad) throws SQLException, ClassNotFoundException {
        createFitness = new CreateFitness();
        createFitness.NovedadNueva(novedad);
    }
}
