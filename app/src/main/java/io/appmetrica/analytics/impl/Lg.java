package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Lg implements InterfaceC4703lm {
    public final /* synthetic */ C4595h9 a;
    public final /* synthetic */ Og b;

    public Lg(Og og, C4595h9 c4595h9) {
        this.b = og;
        this.a = c4595h9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4703lm
    public final void a(Object obj) {
        List list = (List) obj;
        C4595h9 c4595h9 = this.a;
        if (hn.a((Collection) list)) {
            return;
        }
        c4595h9.d = new C4547f9[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C4653jk c4653jk = (C4653jk) list.get(i);
            C4547f9[] c4547f9Arr = c4595h9.d;
            Map map = AbstractC4529ef.a;
            C4547f9 c4547f9 = new C4547f9();
            Integer num = c4653jk.a;
            if (num != null) {
                c4547f9.a = num.intValue();
            }
            Integer num2 = c4653jk.b;
            if (num2 != null) {
                c4547f9.b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c4653jk.d)) {
                c4547f9.c = c4653jk.d;
            }
            c4547f9.d = c4653jk.c;
            c4547f9Arr[i] = c4547f9;
            this.b.g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c4595h9.d[i]);
            this.b.g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
