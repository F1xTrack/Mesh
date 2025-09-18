package defpackage;

import android.os.Bundle;
import com.dylanvann.fastimage.FastImageProgressListener;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* renamed from: uS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7414uS extends FX {
    public final /* synthetic */ int b = 1;
    public long c;
    public final /* synthetic */ IS0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7414uS(C7605vS c7605vS, InterfaceC0827Kj interfaceC0827Kj) {
        super(interfaceC0827Kj);
        this.d = c7605vS;
        this.c = 0L;
    }

    @Override // defpackage.FX, defpackage.U21
    public final long H(C6129nj c6129nj, long j) {
        switch (this.b) {
            case 0:
                long jH = super.H(c6129nj, 8192L);
                C7605vS c7605vS = (C7605vS) this.d;
                long jO = c7605vS.b.o();
                if (jH == -1) {
                    this.c = jO;
                } else {
                    this.c += jH;
                }
                String str = c7605vS.a;
                long j2 = this.c;
                C7223tS c7223tS = (C7223tS) c7605vS.c;
                FastImageProgressListener fastImageProgressListener = (FastImageProgressListener) c7223tS.a.get(str);
                if (fastImageProgressListener != null) {
                    HashMap map = c7223tS.b;
                    if (jO <= j2) {
                        c7223tS.a.remove(str);
                        map.remove(str);
                    }
                    float granularityPercentage = fastImageProgressListener.getGranularityPercentage();
                    if (granularityPercentage == 0.0f || j2 == 0 || jO == j2) {
                        fastImageProgressListener.onProgress(str, j2, jO);
                    } else {
                        long j3 = (long) (((j2 * 100.0f) / jO) / granularityPercentage);
                        Long l = (Long) map.get(str);
                        if (l == null || j3 != l.longValue()) {
                            map.put(str, Long.valueOf(j3));
                            fastImageProgressListener.onProgress(str, j2, jO);
                        }
                    }
                }
                return jH;
            default:
                O90.f(c6129nj, "sink");
                long jH2 = super.H(c6129nj, 8192L);
                long j4 = this.c + (jH2 != -1 ? jH2 : 0L);
                this.c = j4;
                KT kt = (KT) this.d;
                PT pt = kt.b;
                IS0 is0 = kt.a;
                long jO2 = is0 != null ? is0.o() : -1L;
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                String str2 = (String) pt.c;
                long j5 = j4 + (str2 != null ? Long.parseLong(str2) : 0L);
                long j6 = jO2 + (str2 != null ? Long.parseLong(str2) : 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis > pt.b + 100 || j5 == j6) {
                    pt.b = jCurrentTimeMillis;
                    bundle2.putDouble("totalBytesWritten", j5);
                    bundle2.putDouble("totalBytesExpectedToWrite", j6);
                    bundle.putString(CommonUrlParts.UUID, (String) pt.d);
                    bundle.putBundle("data", bundle2);
                    ((WT) pt.e).c(bundle, "expo-file-system.downloadProgress");
                }
                return jH2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7414uS(InterfaceC0827Kj interfaceC0827Kj, KT kt) {
        super(interfaceC0827Kj);
        this.d = kt;
    }
}
