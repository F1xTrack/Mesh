package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.telephony.CellIdentityWcdma;
import com.yandex.metrica.DoNotInline;
import kotlin.Metadata;

@Metadata(m22265bv = {1, 0, 3}, m22266d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, m22267d2 = {"Lcom/yandex/metrica/impl/ob/sk;", "Lcom/yandex/metrica/impl/ob/nk;", "Landroid/telephony/CellIdentityWcdma;", "cellIdentity", "", "a", "(Landroid/telephony/CellIdentityWcdma;)Ljava/lang/Integer;", "b", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, m22268k = 1, m22269mv = {1, 1, 15})
@TargetApi(18)
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.sk */
/* loaded from: classes2.dex */
public final class C3604sk implements InterfaceC3474nk<CellIdentityWcdma> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3474nk
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer mo16497b(CellIdentityWcdma cellIdentity) {
        return Integer.valueOf(cellIdentity.getMcc());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3474nk
    /* renamed from: b, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Integer mo16496a(CellIdentityWcdma cellIdentity) {
        return Integer.valueOf(cellIdentity.getMnc());
    }
}
