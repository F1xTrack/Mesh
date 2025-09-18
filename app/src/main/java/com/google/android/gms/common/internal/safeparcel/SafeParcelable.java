package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;

/* loaded from: classes.dex */
public interface SafeParcelable extends Parcelable {
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    public @interface Class {
        String creator();

        boolean creatorIsFinal() default true;

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    public @interface Constructor {
    }

    public @interface Field {
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int m11119id();

        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Indicator {
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface Param {
        /* renamed from: id */
        int m11120id();
    }

    public @interface RemovedParam {
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int m11121id();
    }

    public @interface Reserved {
        int[] value();
    }

    public @interface VersionField {
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: id */
        int m11122id();

        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
