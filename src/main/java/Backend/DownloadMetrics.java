package Backend;

public class DownloadMetrics {
    private boolean active;
    private float progressPercent;
    private long totalSize;
    private boolean multithreaded;
    private final int threadCount = 6;
    private final long maxFileSplitSize = 52428800; // 50 MB

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public float getProgressPercent() {
        return progressPercent;
    }

    public void setProgressPercent(float progressPercent) {
        this.progressPercent = progressPercent;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public boolean isMultithreaded() {
        return multithreaded;
    }

    public void setMultithreaded(boolean multithreaded) {
        this.multithreaded = multithreaded;
    }

    public int getThreadCount() {
        return threadCount;
    }

    public long getMaxFileSplitSize() {
        return maxFileSplitSize;
    }
}
