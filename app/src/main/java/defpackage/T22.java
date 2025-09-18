package defpackage;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class T22 {
    public static final boolean a(InterfaceC1277Qd0 interfaceC1277Qd0) {
        InterfaceC0755Jl interfaceC0755JlM;
        InterfaceC0755Jl interfaceC0755JlO;
        O90.f(interfaceC1277Qd0, "<this>");
        if (interfaceC1277Qd0 instanceof InterfaceC0579He0) {
            InterfaceC5927mf0 interfaceC5927mf0 = (InterfaceC5927mf0) interfaceC1277Qd0;
            Field fieldB = AbstractC6262oP1.b(interfaceC5927mf0);
            if (!(fieldB != null ? fieldB.isAccessible() : true)) {
                return false;
            }
            Method methodC = AbstractC6262oP1.c(interfaceC5927mf0.c());
            if (!(methodC != null ? methodC.isAccessible() : true)) {
                return false;
            }
            Method methodC2 = AbstractC6262oP1.c(((InterfaceC0579He0) interfaceC1277Qd0).d());
            if (!(methodC2 != null ? methodC2.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC1277Qd0 instanceof InterfaceC5927mf0) {
            InterfaceC5927mf0 interfaceC5927mf02 = (InterfaceC5927mf0) interfaceC1277Qd0;
            Field fieldB2 = AbstractC6262oP1.b(interfaceC5927mf02);
            if (!(fieldB2 != null ? fieldB2.isAccessible() : true)) {
                return false;
            }
            Method methodC3 = AbstractC6262oP1.c(interfaceC5927mf02.c());
            if (!(methodC3 != null ? methodC3.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC1277Qd0 instanceof InterfaceC1748We0) {
            Field fieldB3 = AbstractC6262oP1.b(((InterfaceC1748We0) interfaceC1277Qd0).k());
            if (!(fieldB3 != null ? fieldB3.isAccessible() : true)) {
                return false;
            }
            Method methodC4 = AbstractC6262oP1.c((InterfaceC6878re0) interfaceC1277Qd0);
            if (!(methodC4 != null ? methodC4.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC1277Qd0 instanceof InterfaceC8212ye0) {
            Field fieldB4 = AbstractC6262oP1.b(((InterfaceC8212ye0) interfaceC1277Qd0).k());
            if (!(fieldB4 != null ? fieldB4.isAccessible() : true)) {
                return false;
            }
            Method methodC5 = AbstractC6262oP1.c((InterfaceC6878re0) interfaceC1277Qd0);
            if (!(methodC5 != null ? methodC5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(interfaceC1277Qd0 instanceof InterfaceC6878re0)) {
                throw new UnsupportedOperationException("Unknown callable: " + interfaceC1277Qd0 + " (" + interfaceC1277Qd0.getClass() + ')');
            }
            InterfaceC6878re0 interfaceC6878re0 = (InterfaceC6878re0) interfaceC1277Qd0;
            Method methodC6 = AbstractC6262oP1.c(interfaceC6878re0);
            if (!(methodC6 != null ? methodC6.isAccessible() : true)) {
                return false;
            }
            AbstractC1589Ud0 abstractC1589Ud0A = AbstractC0433Fh1.a(interfaceC1277Qd0);
            Object objB = (abstractC1589Ud0A == null || (interfaceC0755JlO = abstractC1589Ud0A.o()) == null) ? null : interfaceC0755JlO.b();
            AccessibleObject accessibleObject = objB instanceof AccessibleObject ? (AccessibleObject) objB : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            AbstractC1589Ud0 abstractC1589Ud0A2 = AbstractC0433Fh1.a(interfaceC6878re0);
            Object objB2 = (abstractC1589Ud0A2 == null || (interfaceC0755JlM = abstractC1589Ud0A2.m()) == null) ? null : interfaceC0755JlM.b();
            Constructor constructor = objB2 instanceof Constructor ? (Constructor) objB2 : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
