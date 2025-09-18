package com.p019vk.push.core.filedatastore.migration;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m22267d2 = {"core_release"}, m22268k = 2, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class DataStoreMigrationKt {
    public static final File access$getFileToMigrate(Context context, String str) {
        return new File(context.getFilesDir().getPath() + "/datastore/" + str + ".preferences_pb");
    }
}
