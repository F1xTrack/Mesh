package defpackage;

import android.database.SQLException;
import androidx.work.impl.WorkDatabase_Impl;
import com.statstracker.data.MessageDatabase_Impl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: mr0 */
/* loaded from: classes2.dex */
public final class C5963mr0 extends F9 {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ AbstractC6464pT0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5963mr0(MessageDatabase_Impl messageDatabase_Impl) {
        super(1, 3);
        this.d = messageDatabase_Impl;
    }

    @Override // defpackage.F9
    public final void b(XY xy) throws SQLException {
        switch (this.c) {
            case 0:
                xy.w("CREATE TABLE IF NOT EXISTS `message_table` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `message` TEXT NOT NULL)");
                xy.w("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                xy.w("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'df9434dbcb891cb20fb585d58886ac87')");
                break;
            default:
                xy.w("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                xy.w("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
                xy.w("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
                xy.w("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                xy.w("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
                xy.w("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
                xy.w("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                xy.w("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                xy.w("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                xy.w("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                xy.w("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
                xy.w("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                xy.w("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                xy.w("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                xy.w("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                break;
        }
    }

    @Override // defpackage.F9
    public final void d(XY xy) throws SQLException {
        switch (this.c) {
            case 0:
                xy.w("DROP TABLE IF EXISTS `message_table`");
                MessageDatabase_Impl messageDatabase_Impl = (MessageDatabase_Impl) this.d;
                ArrayList arrayList = messageDatabase_Impl.f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((C1477Ss) messageDatabase_Impl.f.get(i)).getClass();
                    }
                    break;
                }
                break;
            default:
                xy.w("DROP TABLE IF EXISTS `Dependency`");
                xy.w("DROP TABLE IF EXISTS `WorkSpec`");
                xy.w("DROP TABLE IF EXISTS `WorkTag`");
                xy.w("DROP TABLE IF EXISTS `SystemIdInfo`");
                xy.w("DROP TABLE IF EXISTS `WorkName`");
                xy.w("DROP TABLE IF EXISTS `WorkProgress`");
                xy.w("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.d;
                ArrayList arrayList2 = workDatabase_Impl.f;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1477Ss) workDatabase_Impl.f.get(i2)).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.F9
    public final void o(XY xy) {
        switch (this.c) {
            case 0:
                MessageDatabase_Impl messageDatabase_Impl = (MessageDatabase_Impl) this.d;
                ArrayList arrayList = messageDatabase_Impl.f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((C1477Ss) messageDatabase_Impl.f.get(i)).getClass();
                    }
                    break;
                }
                break;
            default:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.d;
                ArrayList arrayList2 = workDatabase_Impl.f;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1477Ss) workDatabase_Impl.f.get(i2)).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.F9
    public final void p(XY xy) throws SQLException {
        switch (this.c) {
            case 0:
                ((MessageDatabase_Impl) this.d).a = xy;
                ((MessageDatabase_Impl) this.d).k(xy);
                ArrayList arrayList = ((MessageDatabase_Impl) this.d).f;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((C1477Ss) ((MessageDatabase_Impl) this.d).f.get(i)).a(xy);
                    }
                    break;
                }
                break;
            default:
                ((WorkDatabase_Impl) this.d).a = xy;
                xy.w("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.d).k(xy);
                ArrayList arrayList2 = ((WorkDatabase_Impl) this.d).f;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C1477Ss) ((WorkDatabase_Impl) this.d).f.get(i2)).a(xy);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.F9
    public final void q(XY xy) throws SQLException {
        switch (this.c) {
            case 0:
                RY1.b(xy);
                break;
            default:
                RY1.b(xy);
                break;
        }
    }

    @Override // defpackage.F9
    public final C1135Oi r(XY xy) {
        switch (this.c) {
            case 0:
                HashMap map = new HashMap(2);
                map.put(NotificationConstants.ID, new C6020n81(1, 1, NotificationConstants.ID, "INTEGER", null, true));
                map.put("message", new C6020n81(0, 1, "message", "TEXT", null, true));
                C6783r81 c6783r81 = new C6783r81("message_table", map, new HashSet(0), new HashSet(0));
                C6783r81 c6783r81A = C6783r81.a(xy, "message_table");
                if (!c6783r81.equals(c6783r81A)) {
                    break;
                } else {
                    break;
                }
            default:
                HashMap map2 = new HashMap(2);
                map2.put("work_spec_id", new C6020n81(1, 1, "work_spec_id", "TEXT", null, true));
                map2.put("prerequisite_id", new C6020n81(2, 1, "prerequisite_id", "TEXT", null, true));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new C6211o81("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList(NotificationConstants.ID)));
                hashSet.add(new C6211o81("WorkSpec", "CASCADE", Arrays.asList("prerequisite_id"), "CASCADE", Arrays.asList(NotificationConstants.ID)));
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new C6593q81("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                hashSet2.add(new C6593q81("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                C6783r81 c6783r812 = new C6783r81("Dependency", map2, hashSet, hashSet2);
                C6783r81 c6783r81A2 = C6783r81.a(xy, "Dependency");
                if (!c6783r812.equals(c6783r81A2)) {
                    break;
                } else {
                    HashMap map3 = new HashMap(27);
                    map3.put(NotificationConstants.ID, new C6020n81(1, 1, NotificationConstants.ID, "TEXT", null, true));
                    map3.put("state", new C6020n81(0, 1, "state", "INTEGER", null, true));
                    map3.put("worker_class_name", new C6020n81(0, 1, "worker_class_name", "TEXT", null, true));
                    map3.put("input_merger_class_name", new C6020n81(0, 1, "input_merger_class_name", "TEXT", null, false));
                    map3.put("input", new C6020n81(0, 1, "input", "BLOB", null, true));
                    map3.put("output", new C6020n81(0, 1, "output", "BLOB", null, true));
                    map3.put("initial_delay", new C6020n81(0, 1, "initial_delay", "INTEGER", null, true));
                    map3.put("interval_duration", new C6020n81(0, 1, "interval_duration", "INTEGER", null, true));
                    map3.put("flex_duration", new C6020n81(0, 1, "flex_duration", "INTEGER", null, true));
                    map3.put("run_attempt_count", new C6020n81(0, 1, "run_attempt_count", "INTEGER", null, true));
                    map3.put("backoff_policy", new C6020n81(0, 1, "backoff_policy", "INTEGER", null, true));
                    map3.put("backoff_delay_duration", new C6020n81(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                    map3.put("last_enqueue_time", new C6020n81(0, 1, "last_enqueue_time", "INTEGER", null, true));
                    map3.put("minimum_retention_duration", new C6020n81(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                    map3.put("schedule_requested_at", new C6020n81(0, 1, "schedule_requested_at", "INTEGER", null, true));
                    map3.put("run_in_foreground", new C6020n81(0, 1, "run_in_foreground", "INTEGER", null, true));
                    map3.put("out_of_quota_policy", new C6020n81(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                    map3.put("period_count", new C6020n81(0, 1, "period_count", "INTEGER", "0", true));
                    map3.put("generation", new C6020n81(0, 1, "generation", "INTEGER", "0", true));
                    map3.put("required_network_type", new C6020n81(0, 1, "required_network_type", "INTEGER", null, true));
                    map3.put("requires_charging", new C6020n81(0, 1, "requires_charging", "INTEGER", null, true));
                    map3.put("requires_device_idle", new C6020n81(0, 1, "requires_device_idle", "INTEGER", null, true));
                    map3.put("requires_battery_not_low", new C6020n81(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                    map3.put("requires_storage_not_low", new C6020n81(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                    map3.put("trigger_content_update_delay", new C6020n81(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                    map3.put("trigger_max_content_delay", new C6020n81(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                    map3.put("content_uri_triggers", new C6020n81(0, 1, "content_uri_triggers", "BLOB", null, true));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(2);
                    hashSet4.add(new C6593q81("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
                    hashSet4.add(new C6593q81("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
                    C6783r81 c6783r813 = new C6783r81("WorkSpec", map3, hashSet3, hashSet4);
                    C6783r81 c6783r81A3 = C6783r81.a(xy, "WorkSpec");
                    if (!c6783r813.equals(c6783r81A3)) {
                        break;
                    } else {
                        HashMap map4 = new HashMap(2);
                        map4.put("tag", new C6020n81(1, 1, "tag", "TEXT", null, true));
                        map4.put("work_spec_id", new C6020n81(2, 1, "work_spec_id", "TEXT", null, true));
                        HashSet hashSet5 = new HashSet(1);
                        hashSet5.add(new C6211o81("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList(NotificationConstants.ID)));
                        HashSet hashSet6 = new HashSet(1);
                        hashSet6.add(new C6593q81("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                        C6783r81 c6783r814 = new C6783r81("WorkTag", map4, hashSet5, hashSet6);
                        C6783r81 c6783r81A4 = C6783r81.a(xy, "WorkTag");
                        if (!c6783r814.equals(c6783r81A4)) {
                            break;
                        } else {
                            HashMap map5 = new HashMap(3);
                            map5.put("work_spec_id", new C6020n81(1, 1, "work_spec_id", "TEXT", null, true));
                            map5.put("generation", new C6020n81(2, 1, "generation", "INTEGER", "0", true));
                            map5.put("system_id", new C6020n81(0, 1, "system_id", "INTEGER", null, true));
                            HashSet hashSet7 = new HashSet(1);
                            hashSet7.add(new C6211o81("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList(NotificationConstants.ID)));
                            C6783r81 c6783r815 = new C6783r81("SystemIdInfo", map5, hashSet7, new HashSet(0));
                            C6783r81 c6783r81A5 = C6783r81.a(xy, "SystemIdInfo");
                            if (!c6783r815.equals(c6783r81A5)) {
                                break;
                            } else {
                                HashMap map6 = new HashMap(2);
                                map6.put("name", new C6020n81(1, 1, "name", "TEXT", null, true));
                                map6.put("work_spec_id", new C6020n81(2, 1, "work_spec_id", "TEXT", null, true));
                                HashSet hashSet8 = new HashSet(1);
                                hashSet8.add(new C6211o81("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList(NotificationConstants.ID)));
                                HashSet hashSet9 = new HashSet(1);
                                hashSet9.add(new C6593q81("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                                C6783r81 c6783r816 = new C6783r81("WorkName", map6, hashSet8, hashSet9);
                                C6783r81 c6783r81A6 = C6783r81.a(xy, "WorkName");
                                if (!c6783r816.equals(c6783r81A6)) {
                                    break;
                                } else {
                                    HashMap map7 = new HashMap(2);
                                    map7.put("work_spec_id", new C6020n81(1, 1, "work_spec_id", "TEXT", null, true));
                                    map7.put("progress", new C6020n81(0, 1, "progress", "BLOB", null, true));
                                    HashSet hashSet10 = new HashSet(1);
                                    hashSet10.add(new C6211o81("WorkSpec", "CASCADE", Arrays.asList("work_spec_id"), "CASCADE", Arrays.asList(NotificationConstants.ID)));
                                    C6783r81 c6783r817 = new C6783r81("WorkProgress", map7, hashSet10, new HashSet(0));
                                    C6783r81 c6783r81A7 = C6783r81.a(xy, "WorkProgress");
                                    if (!c6783r817.equals(c6783r81A7)) {
                                        break;
                                    } else {
                                        HashMap map8 = new HashMap(2);
                                        map8.put("key", new C6020n81(1, 1, "key", "TEXT", null, true));
                                        map8.put("long_value", new C6020n81(0, 1, "long_value", "INTEGER", null, false));
                                        C6783r81 c6783r818 = new C6783r81("Preference", map8, new HashSet(0), new HashSet(0));
                                        C6783r81 c6783r81A8 = C6783r81.a(xy, "Preference");
                                        if (!c6783r818.equals(c6783r81A8)) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
        }
        return new C1135Oi(true, (String) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5963mr0(WorkDatabase_Impl workDatabase_Impl) {
        super(16, 3);
        this.d = workDatabase_Impl;
    }
}
