class Square {
  private double side;
  public final int MAX_SIDE_LENGTH = 10;

  public Square(double theSide) {
    side = theSide;
  }

  double getSide() {
    return side;
  }

  void setSide(double theSide) {
    if (theSide <= MAX_SIDE_LENGTH && theSide >= 0) {
      side = theSide;
    }
    
  }

  public String toString() {
    return "Square with side length = " + this.side;
  }

  double area() {
    return this.side*this.side;
  }

  double diagonal() {
    return Math.sqrt((this.side*this.side)+(this.side*this.side));
  }
}
