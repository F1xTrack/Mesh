package defpackage;

import android.graphics.Rect;
import android.media.MediaCodec;
import android.util.Size;
import java.util.Comparator;
import ru.ok.tracer.crash.report.CrashStorage$special$$inlined$compareBy$1;

/* renamed from: hv, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4243hv implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C4243hv(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
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
                return ((CrashStorage$special$$inlined$compareBy$1) this.b).compare(obj, obj2);
            case 1:
                for (InterfaceC6099nZ interfaceC6099nZ : (InterfaceC6099nZ[]) this.b) {
                    int iB = GT1.b((Comparable) interfaceC6099nZ.invoke(obj), (Comparable) interfaceC6099nZ.invoke(obj2));
                    if (iB != 0) {
                        return iB;
                    }
                }
                return 0;
            case 2:
                InterfaceC1934Yo0 interfaceC1934Yo0 = (InterfaceC1934Yo0) this.b;
                return interfaceC1934Yo0.a(obj2) - interfaceC1934Yo0.a(obj);
            case 3:
                C8211ye c8211ye = (C8211ye) obj2;
                ((FC) this.b).getClass();
                Class cls = ((C8211ye) obj).a.j;
                int i = 1;
                int i2 = cls == MediaCodec.class ? 2 : cls == C3349dD0.class ? 0 : 1;
                Class cls2 = c8211ye.a.j;
                if (cls2 == MediaCodec.class) {
                    i = 2;
                } else if (cls2 == C3349dD0.class) {
                    i = 0;
                }
                return i2 - i;
            default:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                int width = size.getWidth();
                Rect rect = (Rect) this.b;
                return (Math.abs(size.getHeight() - rect.height()) + Math.abs(width - rect.width())) - (Math.abs(size2.getHeight() - rect.height()) + Math.abs(size2.getWidth() - rect.width()));
        }
    }
}
