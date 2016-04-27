/**
 * 
 */
package fxc.data;

import fxc.entity.Role;

/**
 * @author fxc
 * 
 */
public class RoleData {

	public static Role RandomRole() {
		Role role = new Role();
		role.setName("admin");
		role.setPermissions("1,2");
		return role;
	}
}
