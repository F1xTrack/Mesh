package com.huawei.hms.p015rn.push.constants;

/* loaded from: classes.dex */
public interface LocalNotification {

    public enum Bitmap {
        BIG_PICTURE,
        LARGE_ICON
    }

    public interface Importance {
        public static final String DEFAULT = "default";
        public static final String HIGH = "high";
        public static final String LOW = "low";
        public static final String MAX = "max";
        public static final String MIN = "min";
        public static final String NONE = "none";
        public static final String UNSPECIFIED = "unspecified";
    }

    public interface Priority {
        public static final String DEFAULT = "default";
        public static final String HIGH = "high";
        public static final String LOW = "low";
        public static final String MAX = "max";
        public static final String MIN = "min";
    }

    public interface Repeat {

        public interface Time {
            public static final int ONE_DAY = 86400000;
            public static final int ONE_HOUR = 3600000;
            public static final int ONE_MINUTE = 60000;
            public static final int ONE_WEEK = 604800000;
        }

        public interface Type {
            public static final String CUSTOM_TIME = "custom_time";
            public static final String DAY = "day";
            public static final String HOUR = "hour";
            public static final String MINUTE = "minute";
            public static final String WEEK = "week";
        }
    }

    public interface Visibility {
        public static final String PRIVATE = "private";
        public static final String PUBLIC = "public";
        public static final String SECRET = "secret";
    }
}
