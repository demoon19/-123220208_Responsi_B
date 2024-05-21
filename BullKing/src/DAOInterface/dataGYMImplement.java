/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOInterface;
import java.util.List;
import isi.*;
/**
 *
 * @author Lab Informatika
 */
public interface dataGYMImplement {
    public void insert(dataGYM p);
    public void update(dataGYM p);
    public void delete(int id);
    public  List<dataGYM> getAll();
}
