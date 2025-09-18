package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.i2 */
/* loaded from: classes2.dex */
public final class C5186i2 extends AbstractC5200ig {

    /* renamed from: b */
    public final C5482tn f31888b;

    /* renamed from: c */
    public final C5253kj f31889c;

    public C5186i2(C5139g5 c5139g5) {
        this(c5139g5, c5139g5.m20430u(), C5253kj.m20652c());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5200ig
    /* renamed from: a */
    public final boolean mo19341a(C4821T5 c4821t5) {
        C5139g5 c5139g5 = this.f31942a;
        if (!this.f31888b.m21104c() && !this.f31888b.m21105d()) {
            if (((C4473Eg) c5139g5.f31733l.m21113a()).f30082f) {
                this.f31889c.m20656b();
            }
            C4561I8 c4561i8 = this.f31942a.f31734m;
            if (c4561i8.f30278c == null) {
                c4561i8.m19496a();
            }
            C4609K8 c4609k8 = c4561i8.f30278c;
            c4609k8.getClass();
            c4609k8.f30392b = new HashSet();
            c4609k8.f30394d = 0;
            C4609K8 c4609k82 = c4561i8.f30278c;
            c4609k82.f30391a = true;
            C4681N8 c4681n8 = c4561i8.f30277b;
            IBinaryDataHelper iBinaryDataHelper = c4681n8.f30506c;
            C4657M8 c4657m8 = c4681n8.f30505b;
            c4681n8.f30504a.getClass();
            C5393q9 c5393q9M19595a = C4633L8.m19595a(c4609k82);
            c4657m8.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(c5393q9M19595a));
        }
        return false;
    }

    public C5186i2(C5139g5 c5139g5, C5482tn c5482tn, C5253kj c5253kj) {
        super(c5139g5);
        this.f31888b = c5482tn;
        this.f31889c = c5253kj;
    }
}
