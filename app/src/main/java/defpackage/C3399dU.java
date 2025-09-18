package defpackage;

import java.io.File;
import java.util.ArrayDeque;

/* renamed from: dU */
/* loaded from: classes2.dex */
public final class C3399dU extends AbstractC5990n0 {
    public final ArrayDeque c;
    public final /* synthetic */ C3780fU d;

    public C3399dU(C3780fU c3780fU) {
        this.d = c3780fU;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        if (((File) c3780fU.b).isDirectory()) {
            arrayDeque.push(b((File) c3780fU.b));
        } else {
            if (!((File) c3780fU.b).isFile()) {
                this.a = 2;
                return;
            }
            File file = (File) c3780fU.b;
            O90.f(file, "rootFile");
            arrayDeque.push(new C2333bU(file));
        }
    }

    @Override // defpackage.AbstractC5990n0
    public final void a() {
        File file;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.c;
            AbstractC3589eU abstractC3589eU = (AbstractC3589eU) arrayDeque.peek();
            if (abstractC3589eU == null) {
                file = null;
                break;
            }
            fileA = abstractC3589eU.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else {
                if (fileA.equals(abstractC3589eU.a) || !fileA.isDirectory()) {
                    break;
                }
                int size = arrayDeque.size();
                this.d.getClass();
                if (size >= Integer.MAX_VALUE) {
                    break;
                } else {
                    arrayDeque.push(b(fileA));
                }
            }
        }
        file = fileA;
        if (file == null) {
            this.a = 2;
        } else {
            this.b = file;
            this.a = 1;
        }
    }

    public final ZT b(File file) {
        int iOrdinal = ((EnumC5511kU) this.d.c).ordinal();
        if (iOrdinal == 0) {
            return new C2523cU(this, file);
        }
        if (iOrdinal == 1) {
            return new C2142aU(this, file);
        }
        throw new C7074sg();
    }
}
