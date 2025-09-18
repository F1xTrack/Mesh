package defpackage;

import android.icu.util.ULocale;
import android.location.GnssMeasurement;
import android.media.ExifInterface;
import java.io.FileDescriptor;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class L10 {
    public static /* bridge */ /* synthetic */ ULocale i(Object obj) {
        return (ULocale) obj;
    }

    public static /* bridge */ /* synthetic */ GnssMeasurement k(Object obj) {
        return (GnssMeasurement) obj;
    }

    public static /* synthetic */ ExifInterface l(FileDescriptor fileDescriptor) {
        return new ExifInterface(fileDescriptor);
    }
}
