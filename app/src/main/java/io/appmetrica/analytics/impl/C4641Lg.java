package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Lg */
/* loaded from: classes2.dex */
public final class C4641Lg implements InterfaceC5281lm {

    /* renamed from: a */
    public final /* synthetic */ C5168h9 f30449a;

    /* renamed from: b */
    public final /* synthetic */ C4713Og f30450b;

    public C4641Lg(C4713Og c4713Og, C5168h9 c5168h9) {
        this.f30450b = c4713Og;
        this.f30449a = c5168h9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5281lm
    /* renamed from: a */
    public final void mo19598a(Object obj) {
        List list = (List) obj;
        C5168h9 c5168h9 = this.f30449a;
        if (AbstractC5182hn.m20513a((Collection) list)) {
            return;
        }
        c5168h9.f31854d = new C5118f9[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C5229jk c5229jk = (C5229jk) list.get(i);
            C5118f9[] c5118f9Arr = c5168h9.f31854d;
            Map map = AbstractC5099ef.f31598a;
            C5118f9 c5118f9 = new C5118f9();
            Integer num = c5229jk.f31989a;
            if (num != null) {
                c5118f9.f31673a = num.intValue();
            }
            Integer num2 = c5229jk.f31990b;
            if (num2 != null) {
                c5118f9.f31674b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c5229jk.f31992d)) {
                c5118f9.f31675c = c5229jk.f31992d;
            }
            c5118f9.f31676d = c5229jk.f31991c;
            c5118f9Arr[i] = c5118f9;
            this.f30450b.f30566g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c5168h9.f31854d[i]);
            this.f30450b.f30566g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
