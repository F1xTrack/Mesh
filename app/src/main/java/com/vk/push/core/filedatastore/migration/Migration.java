package com.vk.push.core.filedatastore.migration;

import android.content.Context;
import defpackage.InterfaceC1729Vy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u000bJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\b2\u0006\u0010\u0004\u001a\u00020\u0003H¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"Lcom/vk/push/core/filedatastore/migration/Migration;", "T", "", "Landroid/content/Context;", "context", "", "shouldMigrate", "(Landroid/content/Context;LVy;)Ljava/lang/Object;", "LPS0;", "migrate-gIAlu-s", "migrate", "Companion", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface Migration<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.a;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/vk/push/core/filedatastore/migration/Migration$Companion;", "", "T", "Lcom/vk/push/core/filedatastore/migration/Migration;", "noMigration$core_release", "()Lcom/vk/push/core/filedatastore/migration/Migration;", "noMigration", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public final <T> Migration<T> noMigration$core_release() {
            return new Migration$Companion$noMigration$1();
        }
    }

    /* renamed from: migrate-gIAlu-s */
    Object mo81migrategIAlus(Context context, InterfaceC1729Vy interfaceC1729Vy);

    Object shouldMigrate(Context context, InterfaceC1729Vy interfaceC1729Vy);
}
