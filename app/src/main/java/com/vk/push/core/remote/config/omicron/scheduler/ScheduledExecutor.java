package com.vk.push.core.remote.config.omicron.scheduler;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public interface ScheduledExecutor {

    public interface ScheduledTask {
        TaskResult execute();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TaskResult {
        public static final TaskResult FAIL;
        public static final TaskResult SUCCESS;
        public static final /* synthetic */ TaskResult[] a;

        static {
            TaskResult taskResult = new TaskResult("SUCCESS", 0);
            SUCCESS = taskResult;
            TaskResult taskResult2 = new TaskResult("FAIL", 1);
            FAIL = taskResult2;
            a = new TaskResult[]{taskResult, taskResult2};
        }

        public static TaskResult valueOf(String str) {
            return (TaskResult) Enum.valueOf(TaskResult.class, str);
        }

        public static TaskResult[] values() {
            return (TaskResult[]) a.clone();
        }
    }

    boolean isActive();

    void schedule(ScheduledTask scheduledTask, int i, TimeUnit timeUnit);
}
