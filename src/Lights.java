public enum Lights {
    RED("The color of the traffic light is red. Stop! Wait for the green light"),
    YELLOW("The color of the traffic light is yellow. Get ready to move"),
    GREEN("The color of the traffic light is green. Go!");

    private final String lights;
    Lights(String lights) {
        this.lights = lights;
    }

    public String getLights() {
        return lights;
    }
}
