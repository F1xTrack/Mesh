package com.vk.push.core.remote.config.omicron;

import defpackage.C1538Tm0;
import defpackage.C3759fN;
import defpackage.C6518pl0;
import defpackage.S20;

/* loaded from: classes2.dex */
public interface OmicronEnvironment {
    public static final OmicronEnvironment DEV = new C3759fN(18);
    public static final OmicronEnvironment ALPHA = new S20(18);
    public static final OmicronEnvironment BETA = new C6518pl0(18);
    public static final OmicronEnvironment RELEASE = new C1538Tm0(18);

    String name();
}
