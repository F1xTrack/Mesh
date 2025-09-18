package com.p019vk.push.core.remote.config.omicron;

import p000.C10689pl0;
import p000.C4049fN;
import p000.C8326Tm0;
import p000.S20;

/* loaded from: classes2.dex */
public interface OmicronEnvironment {
    public static final OmicronEnvironment DEV = new C4049fN(18);
    public static final OmicronEnvironment ALPHA = new S20(18);
    public static final OmicronEnvironment BETA = new C10689pl0(18);
    public static final OmicronEnvironment RELEASE = new C8326Tm0(18);

    String name();
}
