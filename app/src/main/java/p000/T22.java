package p000;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class T22 {
    /* renamed from: a */
    public static final boolean m7537a(InterfaceC8152Qd0 interfaceC8152Qd0) {
        InterfaceC0615Jl interfaceC0615JlMo8091m;
        InterfaceC0615Jl interfaceC0615JlMo8093o;
        O90.m5968f(interfaceC8152Qd0, "<this>");
        if (interfaceC8152Qd0 instanceof InterfaceC7686He0) {
            InterfaceC10293mf0 interfaceC10293mf0 = (InterfaceC10293mf0) interfaceC8152Qd0;
            Field fieldM23392b = AbstractC10518oP1.m23392b(interfaceC10293mf0);
            if (!(fieldM23392b != null ? fieldM23392b.isAccessible() : true)) {
                return false;
            }
            Method methodM23393c = AbstractC10518oP1.m23393c(interfaceC10293mf0.mo3001c());
            if (!(methodM23393c != null ? methodM23393c.isAccessible() : true)) {
                return false;
            }
            Method methodM23393c2 = AbstractC10518oP1.m23393c(((InterfaceC7686He0) interfaceC8152Qd0).mo247d());
            if (!(methodM23393c2 != null ? methodM23393c2.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC8152Qd0 instanceof InterfaceC10293mf0) {
            InterfaceC10293mf0 interfaceC10293mf02 = (InterfaceC10293mf0) interfaceC8152Qd0;
            Field fieldM23392b2 = AbstractC10518oP1.m23392b(interfaceC10293mf02);
            if (!(fieldM23392b2 != null ? fieldM23392b2.isAccessible() : true)) {
                return false;
            }
            Method methodM23393c3 = AbstractC10518oP1.m23393c(interfaceC10293mf02.mo3001c());
            if (!(methodM23393c3 != null ? methodM23393c3.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC8152Qd0 instanceof InterfaceC8466We0) {
            Field fieldM23392b3 = AbstractC10518oP1.m23392b(((InterfaceC8466We0) interfaceC8152Qd0).mo1739k());
            if (!(fieldM23392b3 != null ? fieldM23392b3.isAccessible() : true)) {
                return false;
            }
            Method methodM23393c4 = AbstractC10518oP1.m23393c((InterfaceC10931re0) interfaceC8152Qd0);
            if (!(methodM23393c4 != null ? methodM23393c4.isAccessible() : true)) {
                return false;
            }
        } else if (interfaceC8152Qd0 instanceof InterfaceC11824ye0) {
            Field fieldM23392b4 = AbstractC10518oP1.m23392b(((InterfaceC11824ye0) interfaceC8152Qd0).mo1739k());
            if (!(fieldM23392b4 != null ? fieldM23392b4.isAccessible() : true)) {
                return false;
            }
            Method methodM23393c5 = AbstractC10518oP1.m23393c((InterfaceC10931re0) interfaceC8152Qd0);
            if (!(methodM23393c5 != null ? methodM23393c5.isAccessible() : true)) {
                return false;
            }
        } else {
            if (!(interfaceC8152Qd0 instanceof InterfaceC10931re0)) {
                throw new UnsupportedOperationException("Unknown callable: " + interfaceC8152Qd0 + " (" + interfaceC8152Qd0.getClass() + ')');
            }
            InterfaceC10931re0 interfaceC10931re0 = (InterfaceC10931re0) interfaceC8152Qd0;
            Method methodM23393c6 = AbstractC10518oP1.m23393c(interfaceC10931re0);
            if (!(methodM23393c6 != null ? methodM23393c6.isAccessible() : true)) {
                return false;
            }
            AbstractC8360Ud0 abstractC8360Ud0M2749a = AbstractC7589Fh1.m2749a(interfaceC8152Qd0);
            Object objMo3320b = (abstractC8360Ud0M2749a == null || (interfaceC0615JlMo8093o = abstractC8360Ud0M2749a.mo8093o()) == null) ? null : interfaceC0615JlMo8093o.mo3320b();
            AccessibleObject accessibleObject = objMo3320b instanceof AccessibleObject ? (AccessibleObject) objMo3320b : null;
            if (!(accessibleObject != null ? accessibleObject.isAccessible() : true)) {
                return false;
            }
            AbstractC8360Ud0 abstractC8360Ud0M2749a2 = AbstractC7589Fh1.m2749a(interfaceC10931re0);
            Object objMo3320b2 = (abstractC8360Ud0M2749a2 == null || (interfaceC0615JlMo8091m = abstractC8360Ud0M2749a2.mo8091m()) == null) ? null : interfaceC0615JlMo8091m.mo3320b();
            Constructor constructor = objMo3320b2 instanceof Constructor ? (Constructor) objMo3320b2 : null;
            if (!(constructor != null ? constructor.isAccessible() : true)) {
                return false;
            }
        }
        return true;
    }
}
