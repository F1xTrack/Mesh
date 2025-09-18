package p000;

import android.os.Bundle;
import com.dylanvann.fastimage.FastImageProgressListener;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* renamed from: uS */
/* loaded from: classes.dex */
public final class C6950uS extends AbstractC0349FX {

    /* renamed from: b */
    public final /* synthetic */ int f43694b = 1;

    /* renamed from: c */
    public long f43695c;

    /* renamed from: d */
    public final /* synthetic */ IS0 f43696d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6950uS(C7013vS c7013vS, InterfaceC0676Kj interfaceC0676Kj) {
        super(interfaceC0676Kj);
        this.f43696d = c7013vS;
        this.f43695c = 0L;
    }

    @Override // p000.AbstractC0349FX, p000.U21
    /* renamed from: H */
    public final long mo96H(C6507nj c6507nj, long j) {
        switch (this.f43694b) {
            case 0:
                long jMo96H = super.mo96H(c6507nj, 8192L);
                C7013vS c7013vS = (C7013vS) this.f43696d;
                long jMo3383o = c7013vS.f44378b.mo3383o();
                if (jMo96H == -1) {
                    this.f43695c = jMo3383o;
                } else {
                    this.f43695c += jMo96H;
                }
                String str = c7013vS.f44377a;
                long j2 = this.f43695c;
                C6887tS c6887tS = (C6887tS) c7013vS.f44379c;
                FastImageProgressListener fastImageProgressListener = (FastImageProgressListener) c6887tS.f43079a.get(str);
                if (fastImageProgressListener != null) {
                    HashMap map = c6887tS.f43080b;
                    if (jMo3383o <= j2) {
                        c6887tS.f43079a.remove(str);
                        map.remove(str);
                    }
                    float granularityPercentage = fastImageProgressListener.getGranularityPercentage();
                    if (granularityPercentage == 0.0f || j2 == 0 || jMo3383o == j2) {
                        fastImageProgressListener.onProgress(str, j2, jMo3383o);
                    } else {
                        long j3 = (long) (((j2 * 100.0f) / jMo3383o) / granularityPercentage);
                        Long l = (Long) map.get(str);
                        if (l == null || j3 != l.longValue()) {
                            map.put(str, Long.valueOf(j3));
                            fastImageProgressListener.onProgress(str, j2, jMo3383o);
                        }
                    }
                }
                return jMo96H;
            default:
                O90.m5968f(c6507nj, "sink");
                long jMo96H2 = super.mo96H(c6507nj, 8192L);
                long j4 = this.f43695c + (jMo96H2 != -1 ? jMo96H2 : 0L);
                this.f43695c = j4;
                C0660KT c0660kt = (C0660KT) this.f43696d;
                C0974PT c0974pt = c0660kt.f6119b;
                IS0 is0 = c0660kt.f6118a;
                long jMo3383o2 = is0 != null ? is0.mo3383o() : -1L;
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                String str2 = (String) c0974pt.f9079c;
                long j5 = j4 + (str2 != null ? Long.parseLong(str2) : 0L);
                long j6 = jMo3383o2 + (str2 != null ? Long.parseLong(str2) : 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis > c0974pt.f9078b + 100 || j5 == j6) {
                    c0974pt.f9078b = jCurrentTimeMillis;
                    bundle2.putDouble("totalBytesWritten", j5);
                    bundle2.putDouble("totalBytesExpectedToWrite", j6);
                    bundle.putString(CommonUrlParts.UUID, (String) c0974pt.f9080d);
                    bundle.putBundle("data", bundle2);
                    ((C1414WT) c0974pt.f9081e).m25722c(bundle, "expo-file-system.downloadProgress");
                }
                return jMo96H2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6950uS(InterfaceC0676Kj interfaceC0676Kj, C0660KT c0660kt) {
        super(interfaceC0676Kj);
        this.f43696d = c0660kt;
    }
}
