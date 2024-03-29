/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

/**
 *
 * @author oriol
 */
public class Box extends Package{ //Box es una clase hija de Package por lo tanto usamos la keyword extends
    
    private double depth;
    private double price; //Añadimos los atributos price y cost
    private double cost; 
    
    public Box(int w, int h, int d, double c, double p){ //Método constructor de la clase Box en el que usamos super para llamar al constructor de la clase padre
        super(w,h);
        depth = d;
        cost = c;
        price = p;
    }
    
    
    public double getDepth(){ //getter de la profundidad de la caja                                              
        return depth;
    }
    
    @Override
    public double getPrice(){ //Redefinición del método getPrice de la interfaz Taxable                                                  
        return price;
    }
    
    public void setPrice(double p){ //stter del atributo price
        price = p;
    }
    
    public double getCost(){ //getter del atributo cost                                                
        return cost;
    }
    
    public void setCost(double c){ //setter del atributo cost
        cost = c;
    }
    
    @Override
    public double calculateProfit(){ //Redefinición del método calculateProfit de la interfaz Taxable
        return getPrice()-getCost();
    }
    
    public void setDepth(double d){ //setter de la profundidad de la caja                                          
        depth = d;
    }
    public Boolean isSuitable(double[] size){ //Método que comprueba si un tamaño cabe en unas medidas determinadas de caja, hará todas las combinaciones posibles, si cabe devuelve true, si no cabe devuelve false.                                                 
       
        if(size[0] <= getHeight() && size[1] <= getWidth() && size[2]<=getDepth()){             
            
            return true;
        
        }else if(size[0] <= getHeight() && size[1] <= getDepth() && size[2] <= getWidth()){
            
            return true;
        
        }else if(size[0] <= getWidth() && size[1] <= getHeight() && size[2] <= getDepth()){
             
            return true;
        
        }else if(size[0] <= getWidth() && size[1] <= getDepth() && size[2] <= getHeight()){
            
            return true;
        
        } else if(size[0] <= getDepth() && size[1] <= getWidth() && size[2] <= getHeight()){
            
            return true;
        
        }else if(size[0] <= getDepth() && size[1] <= getHeight() && size[2] <= getWidth()){
            
            return true;
        }
        return false;
    }
    
    @Override
    public double getPriceOnlyTax(){ //Redefinición del método getPriceOnlyTax de la interfaz Taxable
        return getPrice()*iva;
    }
    
    
    @Override
    public double getPricePlusTax(){ //Redefinición del método getPricePlusTax de la interfaz Taxable
        return getPrice() + getPriceOnlyTax(); 
    }
}