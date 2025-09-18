package p000;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: dr0 */
/* loaded from: classes.dex */
public final class C9165dr0 implements InterfaceC10615pA0, Y10 {

    /* renamed from: a */
    public final Path f26338a = new Path();

    /* renamed from: b */
    public final Path f26339b = new Path();

    /* renamed from: c */
    public final Path f26340c = new Path();

    /* renamed from: d */
    public final ArrayList f26341d = new ArrayList();

    /* renamed from: e */
    public final C9037cr0 f26342e;

    public C9165dr0(C9037cr0 c9037cr0) {
        c9037cr0.getClass();
        this.f26342e = c9037cr0;
    }

    /* renamed from: a */
    public final void m17767a(Path.Op op) {
        Matrix matrixM24754e;
        Matrix matrixM24754e2;
        Path path = this.f26339b;
        path.reset();
        Path path2 = this.f26338a;
        path2.reset();
        ArrayList arrayList = this.f26341d;
        for (int size = arrayList.size() - 1; size >= 1; size--) {
            InterfaceC10615pA0 interfaceC10615pA0 = (InterfaceC10615pA0) arrayList.get(size);
            if (interfaceC10615pA0 instanceof C7108wy) {
                C7108wy c7108wy = (C7108wy) interfaceC10615pA0;
                ArrayList arrayList2 = (ArrayList) c7108wy.m25727e();
                for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                    Path pathMo5778g = ((InterfaceC10615pA0) arrayList2.get(size2)).mo5778g();
                    C11056sc1 c11056sc1 = c7108wy.f45188k;
                    if (c11056sc1 != null) {
                        matrixM24754e2 = c11056sc1.m24754e();
                    } else {
                        matrixM24754e2 = c7108wy.f45180c;
                        matrixM24754e2.reset();
                    }
                    pathMo5778g.transform(matrixM24754e2);
                    path.addPath(pathMo5778g);
                }
            } else {
                path.addPath(interfaceC10615pA0.mo5778g());
            }
        }
        int i = 0;
        InterfaceC10615pA0 interfaceC10615pA02 = (InterfaceC10615pA0) arrayList.get(0);
        if (interfaceC10615pA02 instanceof C7108wy) {
            C7108wy c7108wy2 = (C7108wy) interfaceC10615pA02;
            List listM25727e = c7108wy2.m25727e();
            while (true) {
                ArrayList arrayList3 = (ArrayList) listM25727e;
                if (i >= arrayList3.size()) {
                    break;
                }
                Path pathMo5778g2 = ((InterfaceC10615pA0) arrayList3.get(i)).mo5778g();
                C11056sc1 c11056sc12 = c7108wy2.f45188k;
                if (c11056sc12 != null) {
                    matrixM24754e = c11056sc12.m24754e();
                } else {
                    matrixM24754e = c7108wy2.f45180c;
                    matrixM24754e.reset();
                }
                pathMo5778g2.transform(matrixM24754e);
                path2.addPath(pathMo5778g2);
                i++;
            }
        } else {
            path2.set(interfaceC10615pA02.mo5778g());
        }
        this.f26340c.op(path2, path, op);
    }

    @Override // p000.InterfaceC6793ry
    /* renamed from: b */
    public final void mo1742b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f26341d;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC10615pA0) arrayList.get(i)).mo1742b(list, list2);
            i++;
        }
    }

    @Override // p000.Y10
    /* renamed from: e */
    public final void mo9205e(ListIterator listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC6793ry interfaceC6793ry = (InterfaceC6793ry) listIterator.previous();
            if (interfaceC6793ry instanceof InterfaceC10615pA0) {
                this.f26341d.add((InterfaceC10615pA0) interfaceC6793ry);
                listIterator.remove();
            }
        }
    }

    @Override // p000.InterfaceC10615pA0
    /* renamed from: g */
    public final Path mo5778g() {
        Path path = this.f26340c;
        path.reset();
        C9037cr0 c9037cr0 = this.f26342e;
        if (c9037cr0.f25681b) {
            return path;
        }
        int iM26247x = AbstractC7222ym.m26247x(c9037cr0.f25680a);
        if (iM26247x == 0) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f26341d;
                if (i >= arrayList.size()) {
                    break;
                }
                path.addPath(((InterfaceC10615pA0) arrayList.get(i)).mo5778g());
                i++;
            }
        } else if (iM26247x == 1) {
            m17767a(Path.Op.UNION);
        } else if (iM26247x == 2) {
            m17767a(Path.Op.REVERSE_DIFFERENCE);
        } else if (iM26247x == 3) {
            m17767a(Path.Op.INTERSECT);
        } else if (iM26247x == 4) {
            m17767a(Path.Op.XOR);
        }
        return path;
    }
}
