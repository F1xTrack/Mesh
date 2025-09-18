package io.sentry.android.core;

import io.sentry.InterfaceC5804T;
import java.io.File;
import java.util.Comparator;

/* renamed from: io.sentry.android.core.c0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C5859c0 implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f33657a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f33657a) {
            case 0:
                InterfaceC5804T interfaceC5804T = (InterfaceC5804T) obj;
                InterfaceC5804T interfaceC5804T2 = (InterfaceC5804T) obj2;
                int iCompareTo = interfaceC5804T.mo21435q().compareTo(interfaceC5804T2.mo21435q());
                return iCompareTo != 0 ? iCompareTo : interfaceC5804T.mo21432n().f33380b.f33395a.compareTo(interfaceC5804T2.mo21432n().f33380b.f33395a);
            default:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
        }
    }
}
