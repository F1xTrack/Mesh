package p000;

import java.io.File;
import java.util.ArrayDeque;

/* renamed from: dU */
/* loaded from: classes2.dex */
public final class C3931dU extends AbstractC6462n0 {

    /* renamed from: c */
    public final ArrayDeque f26120c;

    /* renamed from: d */
    public final /* synthetic */ C4056fU f26121d;

    public C3931dU(C4056fU c4056fU) {
        this.f26121d = c4056fU;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f26120c = arrayDeque;
        if (((File) c4056fU.f27215b).isDirectory()) {
            arrayDeque.push(m17690b((File) c4056fU.f27215b));
        } else {
            if (!((File) c4056fU.f27215b).isFile()) {
                this.f38026a = 2;
                return;
            }
            File file = (File) c4056fU.f27215b;
            O90.m5968f(file, "rootFile");
            arrayDeque.push(new C1788bU(file));
        }
    }

    @Override // p000.AbstractC6462n0
    /* renamed from: a */
    public final void mo17689a() {
        File file;
        File fileMo9751a;
        while (true) {
            ArrayDeque arrayDeque = this.f26120c;
            AbstractC3993eU abstractC3993eU = (AbstractC3993eU) arrayDeque.peek();
            if (abstractC3993eU == null) {
                file = null;
                break;
            }
            fileMo9751a = abstractC3993eU.mo9751a();
            if (fileMo9751a == null) {
                arrayDeque.pop();
            } else {
                if (fileMo9751a.equals(abstractC3993eU.f26723a) || !fileMo9751a.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                this.f26121d.getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(m17690b(fileMo9751a));
                }
            }
        }
        file = fileMo9751a;
        if (file == null) {
            this.f38026a = 2;
        } else {
            this.f38027b = file;
            this.f38026a = 1;
        }
    }

    /* renamed from: b */
    public final AbstractC1603ZT m17690b(File file) {
        int iOrdinal = ((EnumC6303kU) this.f26121d.f27216c).ordinal();
        if (iOrdinal == 0) {
            return new C1850cU(this, file);
        }
        if (iOrdinal == 1) {
            return new C1667aU(this, file);
        }
        throw new C6838sg();
    }
}
