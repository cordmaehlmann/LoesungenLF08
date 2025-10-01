package _040_Roboter;

public class _040_RoboterJG {
private String name;
public _040_RoboterJG(String name) {
this.name = normalizeName(name);
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = normalizeName(name);
}


private String normalizeName(String name) {
if (name == null) return null;
if (name.equals("Bernd")) {
return "Herbert";
}
if (name.equals("Best Friend")) {
return "Hesham";
}
return name;
}
}




