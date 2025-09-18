package defpackage;

import kotlin.jvm.functions.Function2;

/* renamed from: p22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6383p22 {
    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC1729Vy a(InterfaceC1729Vy interfaceC1729Vy, InterfaceC1729Vy interfaceC1729Vy2, Function2 function2) {
        O90.f(function2, "<this>");
        if (function2 instanceof AbstractC1594Uf) {
            return ((AbstractC1594Uf) function2).create(interfaceC1729Vy, interfaceC1729Vy2);
        }
        InterfaceC0173Bz context = interfaceC1729Vy2.getContext();
        return context == JN.a ? new P90(interfaceC1729Vy2, interfaceC1729Vy, function2) : new Q90(interfaceC1729Vy2, context, function2, interfaceC1729Vy);
    }

    public static InterfaceC1729Vy b(InterfaceC1729Vy interfaceC1729Vy) {
        InterfaceC1729Vy interfaceC1729VyIntercepted;
        O90.f(interfaceC1729Vy, "<this>");
        AbstractC1963Yy abstractC1963Yy = interfaceC1729Vy instanceof AbstractC1963Yy ? (AbstractC1963Yy) interfaceC1729Vy : null;
        return (abstractC1963Yy == null || (interfaceC1729VyIntercepted = abstractC1963Yy.intercepted()) == null) ? interfaceC1729Vy : interfaceC1729VyIntercepted;
    }

    public static int c(int i) {
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            case 9:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            default:
                return 0;
        }
    }
}
