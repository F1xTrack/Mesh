package com.yandex.metrica;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import com.yandex.metrica.impl.ob.C3061rn;
import com.yandex.metrica.impl.ob.O6;
import io.sentry.C5113c;
import io.sentry.S1;
import io.sentry.android.core.EnumC5107y;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class o implements O6 {
    public final Object a;
    public final Object b;
    public Object c;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // com.yandex.metrica.impl.ob.O6
    public void a() {
        JobParameters jobParameters = (JobParameters) this.a;
        try {
            jobParameters.completeWork((JobWorkItem) this.b);
            ConfigurationJobService configurationJobService = (ConfigurationJobService) this.c;
            ((C3061rn) configurationJobService.a.a()).execute(new n(configurationJobService, 0, jobParameters));
        } catch (Throwable unused) {
        }
    }

    public o(ConfigurationJobService configurationJobService, JobParameters jobParameters, JobWorkItem jobWorkItem) {
        this.c = configurationJobService;
        this.a = jobParameters;
        this.b = jobWorkItem;
    }

    public o() {
        this(new io.sentry.protocol.t((UUID) null), new S1(), (Object) null);
    }

    public o(o oVar) {
        C5113c c5113c;
        io.sentry.protocol.t tVar = (io.sentry.protocol.t) oVar.a;
        S1 s1 = (S1) oVar.b;
        C5113c c5113c2 = (C5113c) oVar.c;
        if (c5113c2 != null) {
            c5113c = new C5113c(c5113c2.a, c5113c2.b, c5113c2.c);
        } else {
            c5113c = null;
        }
        this(tVar, s1, c5113c);
    }

    public o(EnumC5107y enumC5107y) {
        this.a = enumC5107y;
        this.b = null;
        this.c = null;
    }

    public o(EnumC5107y enumC5107y, byte[] bArr) {
        this.a = enumC5107y;
        this.b = bArr;
        this.c = null;
    }
}
