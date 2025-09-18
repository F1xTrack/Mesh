package p000;

import android.icu.util.ULocale;
import android.location.GnssMeasurement;
import android.media.ExifInterface;
import java.io.FileDescriptor;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class L10 {
    /* renamed from: i */
    public static /* bridge */ /* synthetic */ ULocale m4845i(Object obj) {
        return (ULocale) obj;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ GnssMeasurement m4847k(Object obj) {
        return (GnssMeasurement) obj;
    }

    /* renamed from: l */
    public static /* synthetic */ ExifInterface m4848l(FileDescriptor fileDescriptor) {
        return new ExifInterface(fileDescriptor);
    }
}
