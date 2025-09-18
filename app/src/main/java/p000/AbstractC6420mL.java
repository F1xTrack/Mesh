package p000;

import android.media.MediaCodecInfo;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;

/* renamed from: mL */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6420mL {
    /* renamed from: f */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m22781f() {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(1280, 720, 60);
    }

    /* renamed from: g */
    public static /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m22782g(int i, int i2, int i3) {
        return new MediaCodecInfo.VideoCapabilities.PerformancePoint(i, i2, i3);
    }

    /* renamed from: h */
    public static /* bridge */ /* synthetic */ MediaCodecInfo.VideoCapabilities.PerformancePoint m22783h(Object obj) {
        return (MediaCodecInfo.VideoCapabilities.PerformancePoint) obj;
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ CellSignalStrengthNr m22785j(Object obj) {
        return (CellSignalStrengthNr) obj;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ CellSignalStrengthTdscdma m22786k(Object obj) {
        return (CellSignalStrengthTdscdma) obj;
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ Class m22787l() {
        return CellSignalStrengthNr.class;
    }

    /* renamed from: p */
    public static /* synthetic */ void m22791p() {
    }

    /* renamed from: w */
    public static /* bridge */ /* synthetic */ Class m22798w() {
        return CellSignalStrengthTdscdma.class;
    }
}
