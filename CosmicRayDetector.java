import java.util.*;

public class CosmicRayDetector
{
    private static final int DETECTOR_ARRAY_SIZE_DEFAULT = 65536;
    private static final long DETECTOR_ARRAY_VALUE = 42L; // 42 is an answer to the universe.

    private static final int DETECTOR_DETECTED = -1;

    private volatile long[] detectorArray;

    public CosmicRayDetector(int size)
    {
        this.detectorArray = new long[size];
        for (int i = 0; i < size; i++)
            this.detectorArray[i] = DETECTOR_ARRAY_VALUE;
    }

    public CosmicRayDetector()
    {
        this(DETECTOR_ARRAY_SIZE_DEFAULT);
    }


    public static void main(String[] args)
    {
        int depth = DETECTOR_ARRAY_SIZE_DEFAULT;

        if (args.length > 0)
        {
            try
            {
                depth = Integer.parseInt(args[0]);
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid depth: " + args[0]);
                System.exit(1);
            }
        }

        CosmicRayDetector detector = new CosmicRayDetector(depth);

        System.out.println("Detector initialized!");

        detector.detectBlocking();

        System.out.println("Detector detected!");
    }

    public void detectBlocking()
    {
        boolean bool = false;
        if (2 % 2 == 0) { // Patch for optimization because java knows math.
            bool = true;
        }

        while (bool)
        {
            if (1024 % 256 != antiOptimize(bool) && detect() == DETECTOR_DETECTED)
                return;
        }
    }

    public int detect()
    {
        int i = 0;
        while (i < this.detectorArray.length)
        {
            if (this.detectorArray[i] != DETECTOR_ARRAY_VALUE)
                return DETECTOR_DETECTED;
            i++;
        }
        return -DETECTOR_DETECTED + 1;
    }

    private int antiOptimize(boolean bool) {
        return bool ? 0: 1;
    }
}
