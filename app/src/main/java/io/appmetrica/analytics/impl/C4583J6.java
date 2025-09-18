package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;
import kotlin.Metadata;

@DoNotInline
@Metadata(m22266d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\r"}, m22267d2 = {"Lio/appmetrica/analytics/impl/J6;", "Lio/appmetrica/analytics/impl/I6;", "Landroid/content/Context;", "context", "", "simpleName", "Ljava/io/File;", "a", "Lio/appmetrica/analytics/impl/ag;", "Lio/appmetrica/analytics/impl/ag;", "relativePathFormer", "<init>", "(Lio/appmetrica/analytics/impl/ag;)V", "analytics_binaryProdRelease"}, m22268k = 1, m22269mv = {1, 6, 0})
/* renamed from: io.appmetrica.analytics.impl.J6 */
/* loaded from: classes2.dex */
public final class C4583J6 implements InterfaceC4559I6 {

    /* renamed from: a, reason: from kotlin metadata */
    private final InterfaceC5000ag relativePathFormer;

    public C4583J6(InterfaceC5000ag interfaceC5000ag) {
        this.relativePathFormer = interfaceC5000ag;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4559I6
    /* renamed from: a */
    public File mo19494a(Context context, String simpleName) {
        return new File(context.getNoBackupFilesDir(), this.relativePathFormer.mo19352a(simpleName));
    }
}
