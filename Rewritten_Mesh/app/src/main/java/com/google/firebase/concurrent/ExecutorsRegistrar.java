package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p000.C0876Nv;
import p000.C10809qh0;
import p000.C11011sG0;
import p000.C6730rE;
import p000.C6790rv;
import p000.C6853sv;
import p000.InterfaceC0108Bi;
import p000.InterfaceC7026vf;
import p000.InterfaceC7637Gf1;
import p000.InterfaceC8214Ri0;
import p000.RL1;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    public static final C10809qh0 f18445a = new C10809qh0(new C0876Nv(1));

    /* renamed from: b */
    public static final C10809qh0 f18446b = new C10809qh0(new C0876Nv(2));

    /* renamed from: c */
    public static final C10809qh0 f18447c = new C10809qh0(new C0876Nv(3));

    /* renamed from: d */
    public static final C10809qh0 f18448d = new C10809qh0(new C0876Nv(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        C11011sG0 c11011sG0 = new C11011sG0(InterfaceC7026vf.class, ScheduledExecutorService.class);
        C11011sG0[] c11011sG0Arr = {new C11011sG0(InterfaceC7026vf.class, ExecutorService.class), new C11011sG0(InterfaceC7026vf.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c11011sG0);
        for (C11011sG0 c11011sG02 : c11011sG0Arr) {
            RL1.m7000a(c11011sG02, "Null interface");
        }
        Collections.addAll(hashSet, c11011sG0Arr);
        C6853sv c6853sv = new C6853sv(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C6730rE(16), hashSet3);
        C11011sG0 c11011sG03 = new C11011sG0(InterfaceC0108Bi.class, ScheduledExecutorService.class);
        C11011sG0[] c11011sG0Arr2 = {new C11011sG0(InterfaceC0108Bi.class, ExecutorService.class), new C11011sG0(InterfaceC0108Bi.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c11011sG03);
        for (C11011sG0 c11011sG04 : c11011sG0Arr2) {
            RL1.m7000a(c11011sG04, "Null interface");
        }
        Collections.addAll(hashSet4, c11011sG0Arr2);
        C6853sv c6853sv2 = new C6853sv(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C6730rE(17), hashSet6);
        C11011sG0 c11011sG05 = new C11011sG0(InterfaceC8214Ri0.class, ScheduledExecutorService.class);
        C11011sG0[] c11011sG0Arr3 = {new C11011sG0(InterfaceC8214Ri0.class, ExecutorService.class), new C11011sG0(InterfaceC8214Ri0.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c11011sG05);
        for (C11011sG0 c11011sG06 : c11011sG0Arr3) {
            RL1.m7000a(c11011sG06, "Null interface");
        }
        Collections.addAll(hashSet7, c11011sG0Arr3);
        C6853sv c6853sv3 = new C6853sv(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C6730rE(18), hashSet9);
        C6790rv c6790rvM24809a = C6853sv.m24809a(new C11011sG0(InterfaceC7637Gf1.class, Executor.class));
        c6790rvM24809a.f42157g = new C6730rE(19);
        return Arrays.asList(c6853sv, c6853sv2, c6853sv3, c6790rvM24809a.m24549b());
    }
}
