package lastpencil.player;

public abstract class Player {
    private String name = "";
    protected int pencils;

    public abstract int takePencils();

    public void setPencils(int pencils) {
        this.pencils = pencils;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
