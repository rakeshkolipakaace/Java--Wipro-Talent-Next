class Box {

    private int width;
    private int height;
    private int depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);

        int volume = box.getVolume();
        System.out.println("Volume of the box: " + volume);
    }
}
