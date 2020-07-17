
/**
 * Write a description of class Request here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Request
{
String speed;
String geo;
String type;

public Request(String speed, String geo, String type)
{
this.speed=speed;
this.geo=geo;
this.type=type;   
}
public String getSpeed()
{
return speed;    
}
public String getGeo()
{
return geo;   
}
public String getType()
{
return type;    
}
public String carPicker()
{
if(speed.equals("Fast")){
    if(geo.equals("American"))
        if(type.equals("Truck"))
            return "Ford F150";
        else return "Ford Mustang";
    else if(type.equals("Truck"))
        return "Nissan Frontier";
        else return "Nissan Sentra";
    }  
    
    else if(geo.equals("American")){
    if(type.equals("Truck"))
        return "Chevy Silverado";
        else return "Chevy Malibou";
else if (type.equals("Truck"))
     return "Toyota Tacoma";
     else return "Toyato Carolla";

}

}
