package im.actor.core.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class ApiAdminSettings extends BserObject {

    private boolean showAdminsToMembers;
    private boolean canMembersInvite;
    private boolean canMembersEditGroupInfo;
    private boolean canAdminsEditGroupInfo;
    private boolean showJoinLeaveMessages;

    public ApiAdminSettings(boolean showAdminsToMembers, boolean canMembersInvite, boolean canMembersEditGroupInfo, boolean canAdminsEditGroupInfo, boolean showJoinLeaveMessages) {
        this.showAdminsToMembers = showAdminsToMembers;
        this.canMembersInvite = canMembersInvite;
        this.canMembersEditGroupInfo = canMembersEditGroupInfo;
        this.canAdminsEditGroupInfo = canAdminsEditGroupInfo;
        this.showJoinLeaveMessages = showJoinLeaveMessages;
    }

    public ApiAdminSettings() {

    }

    public boolean showAdminsToMembers() {
        return this.showAdminsToMembers;
    }

    public boolean canMembersInvite() {
        return this.canMembersInvite;
    }

    public boolean canMembersEditGroupInfo() {
        return this.canMembersEditGroupInfo;
    }

    public boolean canAdminsEditGroupInfo() {
        return this.canAdminsEditGroupInfo;
    }

    public boolean showJoinLeaveMessages() {
        return this.showJoinLeaveMessages;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.showAdminsToMembers = values.getBool(1);
        this.canMembersInvite = values.getBool(2);
        this.canMembersEditGroupInfo = values.getBool(3);
        this.canAdminsEditGroupInfo = values.getBool(4);
        this.showJoinLeaveMessages = values.getBool(5);
        if (values.hasRemaining()) {
            setUnmappedObjects(values.buildRemaining());
        }
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeBool(1, this.showAdminsToMembers);
        writer.writeBool(2, this.canMembersInvite);
        writer.writeBool(3, this.canMembersEditGroupInfo);
        writer.writeBool(4, this.canAdminsEditGroupInfo);
        writer.writeBool(5, this.showJoinLeaveMessages);
        if (this.getUnmappedObjects() != null) {
            SparseArray<Object> unmapped = this.getUnmappedObjects();
            for (int i = 0; i < unmapped.size(); i++) {
                int key = unmapped.keyAt(i);
                writer.writeUnmapped(key, unmapped.get(key));
            }
        }
    }

    @Override
    public String toString() {
        String res = "struct AdminSettings{";
        res += "showAdminsToMembers=" + this.showAdminsToMembers;
        res += ", canMembersInvite=" + this.canMembersInvite;
        res += ", canMembersEditGroupInfo=" + this.canMembersEditGroupInfo;
        res += ", canAdminsEditGroupInfo=" + this.canAdminsEditGroupInfo;
        res += ", showJoinLeaveMessages=" + this.showJoinLeaveMessages;
        res += "}";
        return res;
    }

}
