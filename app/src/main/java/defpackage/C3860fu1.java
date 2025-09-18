package defpackage;

import com.vk.push.core.data.repository.CrashReporterRepository;
import com.vk.push.core.filedatastore.JsonSerializableFileDataStoreImplKt;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;
import com.vk.push.core.filedatastore.migration.PreferenceDataStoreMigration;

/* renamed from: fu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3860fu1 {
    public static final C3860fu1 a;
    public static final /* synthetic */ InterfaceC5927mf0[] b;
    public static final InterfaceC7018sN0 c;
    public static final InterfaceC7018sN0 d;
    public static final KC0 e;
    public static final InterfaceC7018sN0 f;
    public static final InterfaceC7018sN0 g;
    public static final KC0 h;
    public static final InterfaceC7018sN0 i;
    public static final InterfaceC7018sN0 j;

    static {
        HE0 he0 = new HE0("modeDataStore", "getModeDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C3860fu1.class);
        IP0 ip0 = BP0.a;
        b = new InterfaceC5927mf0[]{ip0.g(he0), ip0.g(new HE0("notificationIdFileDataStore", "getNotificationIdFileDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C3860fu1.class)), ip0.g(new HE0("pushTokenPrefsDataStore", "getPushTokenPrefsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", C3860fu1.class)), ip0.g(new HE0("pushTokenDataStore", "getPushTokenDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C3860fu1.class)), ip0.g(new HE0("pushTokenDeliveryDataStore", "getPushTokenDeliveryDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C3860fu1.class)), ip0.g(new HE0("arbiterDataStoreForMigration", "getArbiterDataStoreForMigration(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", C3860fu1.class)), ip0.g(new HE0("arbiterDataStore", "getArbiterDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C3860fu1.class)), ip0.g(new HE0("defaultMasterHostStore", "getDefaultMasterHostStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C3860fu1.class))};
        a = new C3860fu1();
        C5806m12 c5806m12 = C6546pu1.b;
        F71 f71 = AbstractC1953Yu1.w;
        c = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_sdk_mode", c5806m12, new PreferenceDataStoreMigration("vkpns_client_sdk_mode", C0190Ce1.B), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
        d = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_notification_id", C1332Qv1.b, new PreferenceDataStoreMigration("vkpns_notification_id", C0190Ce1.C), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
        e = AbstractC3758fM1.b("vkpns_client_sdk", new C3513e41(C0190Ce1.I));
        f = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_token", C6155nr1.b, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk", AbstractC8259yu.e(new LC0("push_token")), C0190Ce1.D, C0190Ce1.E), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
        g = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_token_delivery", C7491ur1.c, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk", AbstractC8259yu.f(new LC0("push_token_delivered_to_client_app"), new LC0("last_delivered_push_token")), C0190Ce1.G, C0190Ce1.H), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
        h = AbstractC3758fM1.b("vkpns_client_sdk_arbiter", new C3513e41(C0190Ce1.x));
        i = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_sdk_arbiter", C5204is1.c, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk_arbiter", AbstractC8259yu.f(new LC0("master_host_pub"), new LC0("master_host_package")), C0190Ce1.v, C0190Ce1.w), (CrashReporterRepository) f71.getValue(), true, false, 32, null);
        j = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_default_master_host", C6349os1.b, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk_arbiter", AbstractC8259yu.e(new LC0("master_default_host")), C0190Ce1.y, C0190Ce1.A), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
    }
}
