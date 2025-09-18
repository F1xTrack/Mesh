package p000;

import kotlin.jvm.functions.Function2;

/* renamed from: p22, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10599p22 {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static InterfaceC1382Vy m23594a(InterfaceC1382Vy interfaceC1382Vy, InterfaceC1382Vy interfaceC1382Vy2, Function2 function2) {
        O90.m5968f(function2, "<this>");
        if (function2 instanceof AbstractC1300Uf) {
            return ((AbstractC1300Uf) function2).create(interfaceC1382Vy, interfaceC1382Vy2);
        }
        InterfaceC0125Bz context = interfaceC1382Vy2.getContext();
        return context == C0591JN.f5499a ? new P90(interfaceC1382Vy2, interfaceC1382Vy, function2) : new Q90(interfaceC1382Vy2, context, function2, interfaceC1382Vy);
    }

    /* renamed from: b */
    public static InterfaceC1382Vy m23595b(InterfaceC1382Vy interfaceC1382Vy) {
        InterfaceC1382Vy interfaceC1382VyIntercepted;
        O90.m5968f(interfaceC1382Vy, "<this>");
        AbstractC1571Yy abstractC1571Yy = interfaceC1382Vy instanceof AbstractC1571Yy ? (AbstractC1571Yy) interfaceC1382Vy : null;
        return (abstractC1571Yy == null || (interfaceC1382VyIntercepted = abstractC1571Yy.intercepted()) == null) ? interfaceC1382Vy : interfaceC1382VyIntercepted;
    }

    /* renamed from: c */
    public static int m23596c(int i) {
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
