package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: dr0 */
/* loaded from: classes.dex */
public final class C3468dr0 implements InterfaceC6407pA0, Y10 {
    public final Path a = new Path();
    public final Path b = new Path();
    public final Path c = new Path();
    public final ArrayList d = new ArrayList();
    public final C3278cr0 e;

    public C3468dr0(C3278cr0 c3278cr0) {
        c3278cr0.getClass();
        this.e = c3278cr0;
    }

    public final void a(Path.Op op) {
        Matrix matrixE;
        Matrix matrixE2;
        Path path = this.b;
        path.reset();
        Path path2 = this.a;
        path2.reset();
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            InterfaceC6407pA0 interfaceC6407pA0 = (InterfaceC6407pA0) arrayList.get(size);
            if (interfaceC6407pA0 instanceof C7891wy) {
                C7891wy c7891wy = (C7891wy) interfaceC6407pA0;
                ArrayList arrayList2 = (ArrayList) c7891wy.e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathG = ((InterfaceC6407pA0) arrayList2.get(size2)).g();
                    C7064sc1 c7064sc1 = c7891wy.k;
                    if (c7064sc1 != null) {
                        matrixE2 = c7064sc1.e();
                    } else {
                        matrixE2 = c7891wy.c;
                        matrixE2.reset();
                    }
                    pathG.transform(matrixE2);
                    path.addPath(pathG);
                }
            } else {
                path.addPath(interfaceC6407pA0.g());
            }
        }
        int i = 0;
        InterfaceC6407pA0 interfaceC6407pA02 = (InterfaceC6407pA0) arrayList.get(0);
        if (interfaceC6407pA02 instanceof C7891wy) {
            C7891wy c7891wy2 = (C7891wy) interfaceC6407pA02;
            List listE = c7891wy2.e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listE;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathG2 = ((InterfaceC6407pA0) arrayList3.get(i)).g();
                C7064sc1 c7064sc12 = c7891wy2.k;
                if (c7064sc12 != null) {
                    matrixE = c7064sc12.e();
                } else {
                    matrixE = c7891wy2.c;
                    matrixE.reset();
                }
                pathG2.transform(matrixE);
                path2.addPath(pathG2);
                i++;
            }
        } else {
            path2.set(interfaceC6407pA02.g());
        }
        this.c.op(path2, path, op);
    }

    @Override // defpackage.InterfaceC6937ry
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC6407pA0) arrayList.get(i)).b(list, list2);
            i++;
        }
    }

    @Override // defpackage.Y10
    public final void e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC6937ry interfaceC6937ry = (InterfaceC6937ry) listIterator.previous();
            if (interfaceC6937ry instanceof InterfaceC6407pA0) {
                this.d.add((InterfaceC6407pA0) interfaceC6937ry);
                listIterator.remove();
            }
        }
    }

    @Override // defpackage.InterfaceC6407pA0
    public final Path g() {
        Path path = this.c;
        path.reset();
        C3278cr0 c3278cr0 = this.e;
        if (c3278cr0.b) {
            return path;
        }
        int iX = AbstractC8235ym.x(c3278cr0.a);
        if (iX == 0) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                }
                path.addPath(((InterfaceC6407pA0) arrayList.get(i)).g());
                i++;
            }
        } else if (iX == 1) {
            a(Path.Op.UNION);
        } else if (iX == 2) {
            a(Path.Op.REVERSE_DIFFERENCE);
        } else if (iX == 3) {
            a(Path.Op.INTERSECT);
        } else if (iX == 4) {
            a(Path.Op.XOR);
        }
        return path;
    }
}
