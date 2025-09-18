package p000;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.util.Comparator;
import ru.p031ok.tracer.crash.report.CrashStorage$special$$inlined$compareBy$1;

/* renamed from: hv */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4209hv implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f28674a;

    /* renamed from: b */
    public final /* synthetic */ Object f28675b;

    public /* synthetic */ C4209hv(int i, Object obj) {
        this.f28674a = i;
        this.f28675b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f28674a) {
            case 0:
                if (obj == obj2) {
                    return 0;
                }
                if (obj == null) {
                    return 1;
                }
                if (obj2 == null) {
                    return -1;
                }
                return ((CrashStorage$special$$inlined$compareBy$1) this.f28675b).compare(obj, obj2);
            case 1:
                for (InterfaceC6497nZ interfaceC6497nZ : (InterfaceC6497nZ[]) this.f28675b) {
                    int iM3070b = GT1.m3070b((Comparable) interfaceC6497nZ.invoke(obj), (Comparable) interfaceC6497nZ.invoke(obj2));
                    if (iM3070b != 0) {
                        return iM3070b;
                    }
                }
                return 0;
            case 2:
                InterfaceC8590Yo0 interfaceC8590Yo0 = (InterfaceC8590Yo0) this.f28675b;
                return interfaceC8590Yo0.mo2069a(obj2) - interfaceC8590Yo0.mo2069a(obj);
            case 3:
                C7214ye c7214ye = (C7214ye) obj2;
                ((C0328FC) this.f28675b).getClass();
                Class cls = ((C7214ye) obj).f46367a.f29028j;
                int i = 1;
                int i2 = cls == MediaCodec.class ? 2 : cls == C9085dD0.class ? 0 : 1;
                Class cls2 = c7214ye.f46367a.f29028j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 == C9085dD0.class) {
                    i = 0;
                }
                return i2 - i;
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int width = size.getWidth();
                Rect rect = (Rect) this.f28675b;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(width - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
