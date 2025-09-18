package com.facebook.react.fabric;

import com.yandex.varioqub.config.model.ConfigValue;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/* loaded from: classes.dex */
class LongStreamingStats {
    private final Queue<Long> minHeap = new PriorityQueue(11, Comparator.comparingLong(new C1924a()));
    private final Queue<Long> maxHeap = new PriorityQueue(11, new C1925b());
    private double streamingAverage = ConfigValue.DOUBLE_DEFAULT_VALUE;
    private int len = 0;
    private long max = 0;

    public static /* synthetic */ int lambda$new$1(Long l, Long l2) {
        return Long.compare(l2.longValue(), l.longValue());
    }

    public void add(long j) {
        if (j != 0) {
            if (this.minHeap.size() == this.maxHeap.size()) {
                this.maxHeap.offer(Long.valueOf(j));
                this.minHeap.offer(this.maxHeap.poll());
            } else {
                this.minHeap.offer(Long.valueOf(j));
                this.maxHeap.offer(this.minHeap.poll());
            }
        }
        int i = this.len + 1;
        this.len = i;
        if (i == 1) {
            this.streamingAverage = j;
        } else {
            this.streamingAverage = (this.streamingAverage / (i / r0)) + (j / i);
        }
        long j2 = this.max;
        if (j <= j2) {
            j = j2;
        }
        this.max = j;
    }

    public double getAverage() {
        return this.streamingAverage;
    }

    public long getMax() {
        return this.max;
    }

    public double getMedian() {
        long jLongValue;
        if (this.minHeap.size() == 0 && this.maxHeap.size() == 0) {
            return ConfigValue.DOUBLE_DEFAULT_VALUE;
        }
        if (this.minHeap.size() > this.maxHeap.size()) {
            jLongValue = this.minHeap.peek().longValue();
        } else {
            jLongValue = (this.maxHeap.peek().longValue() + this.minHeap.peek().longValue()) / 2;
        }
        return jLongValue;
    }
}
