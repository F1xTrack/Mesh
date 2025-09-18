package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.tasks.Task;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import kotlin.Metadata;
import p000.C0827N8;
import p000.C0952P7;
import p000.InterfaceC8036Nx0;

@Metadata(m22266d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m22267d2 = {"Lio/appmetrica/analytics/appsetid/internal/AppSetIdRetriever;", "Lio/appmetrica/analytics/appsetid/internal/IAppSetIdRetriever;", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "LTf1;", "retrieveAppSetId", "(Landroid/content/Context;Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;)V", "appsetid_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* renamed from: a */
    private final Object f29559a = new Object();

    /* renamed from: b */
    private final ArrayList f29560b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i) {
        appSetIdRetriever.getClass();
        return i != 1 ? i != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(Context context, final AppSetIdListener listener) throws Throwable {
        Task taskM5562n = new C0827N8(context, 1).m5562n();
        InterfaceC8036Nx0 interfaceC8036Nx0 = new InterfaceC8036Nx0() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // p000.InterfaceC8036Nx0
            public void onComplete(Task completedTask) {
                Object obj = this.f29561a.f29559a;
                AppSetIdRetriever appSetIdRetriever = this.f29561a;
                synchronized (obj) {
                    appSetIdRetriever.f29560b.remove(this);
                }
                if (completedTask.mo11144k()) {
                    listener.onAppSetIdRetrieved(((C0952P7) completedTask.mo11142i()).f8865a, AppSetIdRetriever.access$convertScope(this.f29561a, ((C0952P7) completedTask.mo11142i()).f8866b));
                } else {
                    listener.onFailure(completedTask.mo11141h());
                }
            }
        };
        synchronized (this.f29559a) {
            this.f29560b.add(interfaceC8036Nx0);
        }
        taskM5562n.mo11135b(interfaceC8036Nx0);
    }
}
