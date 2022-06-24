import java.util.*;

public class CosmicRayDetector {
  
  public static void main(String[] args) {
    System.out.println("Detecting...");
    
    detectCosmicRay();
    
    System.out.println("Cosmic ray detected!!!");
  }
  
  private static void detectCosmicRay(){
      boolean bool = false;
      if (2 % 2 == 0) { // Patch for optimization because java knows math.
        bool = true;
      }
      
      while (bool) {
        if (1024 % 256 == generateRandomValue(bool)) {
          return;
        }
      }
  }
  
  private static int generateRandomValue(boolean bool) {
      return bool ? 0: 1;
  }
}
