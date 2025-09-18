package p000;

import com.p019vk.push.core.data.repository.CrashReporterRepository;
import com.p019vk.push.core.filedatastore.JsonSerializableFileDataStoreImplKt;
import com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreByKeyMigration;
import com.p019vk.push.core.filedatastore.migration.PreferenceDataStoreMigration;

/* renamed from: fu1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9428fu1 {

    /* renamed from: a */
    public static final C9428fu1 f27451a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC10293mf0[] f27452b;

    /* renamed from: c */
    public static final InterfaceC11025sN0 f27453c;

    /* renamed from: d */
    public static final InterfaceC11025sN0 f27454d;

    /* renamed from: e */
    public static final KC0 f27455e;

    /* renamed from: f */
    public static final InterfaceC11025sN0 f27456f;

    /* renamed from: g */
    public static final InterfaceC11025sN0 f27457g;

    /* renamed from: h */
    public static final KC0 f27458h;

    /* renamed from: i */
    public static final InterfaceC11025sN0 f27459i;

    /* renamed from: j */
    public static final InterfaceC11025sN0 f27460j;

    static {
        HE0 he0 = new HE0("modeDataStore", "getModeDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C9428fu1.class);
        IP0 ip0 = BP0.f799a;
        f27452b = new InterfaceC10293mf0[]{ip0.mo3851g(he0), ip0.mo3851g(new HE0("notificationIdFileDataStore", "getNotificationIdFileDataStore(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C9428fu1.class)), ip0.mo3851g(new HE0("pushTokenPrefsDataStore", "getPushTokenPrefsDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", C9428fu1.class)), ip0.mo3851g(new HE0("pushTokenDataStore", "getPushTokenDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C9428fu1.class)), ip0.mo3851g(new HE0("pushTokenDeliveryDataStore", "getPushTokenDeliveryDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C9428fu1.class)), ip0.mo3851g(new HE0("arbiterDataStoreForMigration", "getArbiterDataStoreForMigration(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", C9428fu1.class)), ip0.mo3851g(new HE0("arbiterDataStore", "getArbiterDataStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C9428fu1.class)), ip0.mo3851g(new HE0("defaultMasterHostStore", "getDefaultMasterHostStore$client_release(Landroid/content/Context;)Lcom/vk/push/core/filedatastore/FileDataStore;", C9428fu1.class))};
        f27451a = new C9428fu1();
        C10212m12 c10212m12 = C10708pu1.f40430b;
        F71 f71 = AbstractC8603Yu1.f14610w;
        f27453c = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_sdk_mode", c10212m12, new PreferenceDataStoreMigration("vkpns_client_sdk_mode", C7427Ce1.f1538B), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
        f27454d = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_notification_id", C8189Qv1.f9865b, new PreferenceDataStoreMigration("vkpns_notification_id", C7427Ce1.f1539C), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
        f27455e = AbstractC9360fM1.m18222b("vkpns_client_sdk", new C9196e41(C7427Ce1.f1545I));
        f27456f = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_token", C10446nr1.f38563b, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk", AbstractC7230yu.m26274e(new LC0("push_token")), C7427Ce1.f1540D, C7427Ce1.f1541E), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
        f27457g = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_push_token_delivery", C11342ur1.f43996c, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk", AbstractC7230yu.m26275f(new LC0("push_token_delivered_to_client_app"), new LC0("last_delivered_push_token")), C7427Ce1.f1543G, C7427Ce1.f1544H), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
        f27458h = AbstractC9360fM1.m18222b("vkpns_client_sdk_arbiter", new C9196e41(C7427Ce1.f1564x));
        f27459i = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_sdk_arbiter", C9808is1.f34790c, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk_arbiter", AbstractC7230yu.m26275f(new LC0("master_host_pub"), new LC0("master_host_package")), C7427Ce1.f1562v, C7427Ce1.f1563w), (CrashReporterRepository) f71.getValue(), true, false, 32, null);
        f27460j = JsonSerializableFileDataStoreImplKt.fileDataStore$default("vkpns_client_default_master_host", C10576os1.f39328b, new PreferenceDataStoreByKeyMigration("vkpns_client_sdk_arbiter", AbstractC7230yu.m26274e(new LC0("master_default_host")), C7427Ce1.f1565y, C7427Ce1.f1537A), (CrashReporterRepository) f71.getValue(), false, false, 48, null);
    }
}
