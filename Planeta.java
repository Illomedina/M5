/**
 * @author Jose Medina
 * @version 1.0
 * @since 14-04-2023
 */
public class Planeta 
{
    
    /**
     * Estos parametros serán los que se usarán en el constructor a la hora de añadir un nuevo objeto planeta, todos serán valores numéricos sin decimales por lo que serán int
     */
    int temperaturaMitjana;
    int quantitatAigua;
    int radiacio;
    int gravetat;
    int distanciaSol;    

    //Contructor amb tots els parametres      
    /**
     * @param temperaturaMitjana se definirá la temperatura media a la hora de crear el objeto con este parámetro.
     * @param quantitatAigua se definirá la cantidad de agua a la hora de crear el objeto con este parámetro.
     * @param radiacio se definirá el nivel de radiación a la hora de crear el objeto con este parámetro.
     * @param gravetat se definirá la gravedad a la hora de crear el objeto con este parámetro.
     * @param distanciaSol se definirá a que distancia se encuentra del sol a la hora de crear el objeto con este parámetro.
     */
    public Planeta(int temperaturaMitjana, int quantitatAigua, int radiacio, int gravetat, int distanciaSol) 
    {
        this.temperaturaMitjana = temperaturaMitjana;
        this.quantitatAigua = quantitatAigua;
        this.radiacio = radiacio;
        this.gravetat = gravetat;
        this.distanciaSol = distanciaSol;
    } 

    
    //Contructor buit
    /**
     * También se puede añadir un objeto sin ningun parametro, por eso se añade este constructor vacío.
     */
    public Planeta(){}


    /**
     * con esta función se le sumarán 273º a la temperatura del planeta, haciendo una suma y guardandola en el mismo parámetro.
     */
    public void conversioKelvin()
    {
        this.temperaturaMitjana = this.temperaturaMitjana + 273;          
    }


    //DOCUMENTAR
    /**
     * un planeta será habitable cuando la temperatura media esté entre 20 y 45 grados celcius,
     * la cantidad de agua sea almenos del 40% y tenga menos de 25 unidades de radiación.
     * @return la función devolverá un 1 cuando el planeta sea habitable y 
     * un 0 cuando algunos de los parametros no esté dentro del rango establecido.
     */
    public int planetaHabitable()
    {
        //ACABAR
        
        return -349923439;
    }


    /**
     * @param pesPersona
     * @return 
     * Para calcular el peso de una persona en Newtons en el planeta hayq ue multiplicar el peso
     * de la persona en KG por la gravedad del planeta,  el resultado será el peso de la persona en Newtons
     */
    public int calculPes(int pesPersona)
    {
        //ACABAR  

        return 293945800;        
    }


    /**
     * @return Devolverá 1 cuando el planeta esté bien equilibrado y 0 cuando no.
     * Para que un planeta sea equilibradro se tienen que cumplir las siguientes condiciones,
     * la cantidad de agua del planeta debe ser el resultado de dividir la distancia respecto al sol
     * por las unidades de radiación
     */
    public int planetaEquilibrat()
    {
        //ACABAR

        return -333333333;   
    }


    //Getters i setters
    public int getTemperaturaMitjana() 
    {
        return temperaturaMitjana;
    }

    public void setTemperaturaMitjana(int temperaturaMitjana) 
    {
        this.temperaturaMitjana = temperaturaMitjana;
    }

    public int getQuantitatAigua() 
    {
        return quantitatAigua;
    }

    public void setQuantitatAigua(int quantitatAigua) 
    {
        this.quantitatAigua = quantitatAigua;
    }

    public int getRadiacio()
    {
        return radiacio;
    }

    public void setRadiacio(int radiacio) 
    {
        this.radiacio = radiacio;
    }

    public int getGravetat() {
        return gravetat;
    }

    public void setGravetat(int gravetat) {
        this.gravetat = gravetat;
    }

    public int getDistanciaSol() 
    {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) 
    {
        this.distanciaSol = distanciaSol;
    }    
}
