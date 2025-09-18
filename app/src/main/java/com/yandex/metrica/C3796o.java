package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import com.yandex.metrica.impl.p022ob.C3581rn;
import com.yandex.metrica.impl.p022ob.InterfaceC2823O6;
import io.sentry.C5803S1;
import io.sentry.C5985c;
import io.sentry.android.core.EnumC5916y;
import io.sentry.protocol.C6104t;
import java.util.UUID;

/* renamed from: com.yandex.metrica.o */
/* loaded from: classes2.dex */
public final class C3796o implements InterfaceC2823O6 {

    /* renamed from: a */
    public final Object f25478a;

    /* renamed from: b */
    public final Object f25479b;

    /* renamed from: c */
    public Object f25480c;

    public /* synthetic */ C3796o(Object obj, Object obj2, Object obj3) {
        this.f25478a = obj;
        this.f25479b = obj2;
        this.f25480c = obj3;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2823O6
    /* renamed from: a */
    public void mo14694a() {
        JobParameters jobParameters = (JobParameters) this.f25478a;
        try {
            jobParameters.completeWork((JobWorkItem) this.f25479b);
            ConfigurationJobService configurationJobService = (ConfigurationJobService) this.f25480c;
            ((C3581rn) configurationJobService.f20726a.m14418a()).execute(new RunnableC3795n(configurationJobService, 0, jobParameters));
        } catch (Throwable unused) {
        }
    }

    public C3796o(ConfigurationJobService configurationJobService, JobParameters jobParameters, JobWorkItem jobWorkItem) {
        this.f25480c = configurationJobService;
        this.f25478a = jobParameters;
        this.f25479b = jobWorkItem;
    }

    public C3796o() {
        this(new C6104t((UUID) null), new C5803S1(), (Object) null);
    }

    public C3796o(C3796o c3796o) {
        C5985c c5985c;
        C6104t c6104t = (C6104t) c3796o.f25478a;
        C5803S1 c5803s1 = (C5803S1) c3796o.f25479b;
        C5985c c5985c2 = (C5985c) c3796o.f25480c;
        if (c5985c2 != null) {
            c5985c = new C5985c(c5985c2.f34086a, c5985c2.f34087b, c5985c2.f34088c);
        } else {
            c5985c = null;
        }
        this(c6104t, c5803s1, c5985c);
    }

    public C3796o(EnumC5916y enumC5916y) {
        this.f25478a = enumC5916y;
        this.f25479b = null;
        this.f25480c = null;
    }

    public C3796o(EnumC5916y enumC5916y, byte[] bArr) {
        this.f25478a = enumC5916y;
        this.f25479b = bArr;
        this.f25480c = null;
    }
}
