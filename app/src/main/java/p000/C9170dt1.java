package p000;

import com.p019vk.push.common.messaging.NotificationAnalyticsPayload;
import com.p019vk.push.common.messaging.NotificationPayload;
import kotlin.Pair;

/* renamed from: dt1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9170dt1 extends AbstractC1571Yy {

    /* renamed from: a */
    public U41 f26374a;

    /* renamed from: b */
    public NotificationPayload f26375b;

    /* renamed from: c */
    public Pair f26376c;

    /* renamed from: d */
    public NotificationAnalyticsPayload f26377d;

    /* renamed from: e */
    public int f26378e;

    /* renamed from: f */
    public /* synthetic */ Object f26379f;

    /* renamed from: g */
    public final /* synthetic */ U41 f26380g;

    /* renamed from: h */
    public int f26381h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9170dt1(U41 u41, AbstractC1571Yy abstractC1571Yy) {
        super(abstractC1571Yy);
        this.f26380g = u41;
    }

    @Override // p000.AbstractC1300Uf
    public final Object invokeSuspend(Object obj) {
        this.f26379f = obj;
        this.f26381h |= Integer.MIN_VALUE;
        return this.f26380g.m7880d(null, 0, null, null, this);
    }
}
