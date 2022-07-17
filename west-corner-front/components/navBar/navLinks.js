import styles from "./navBar.module.css";
import { AuthLink } from "../links/authLink";

export const NavLinks = () => {
	return (
		<div className={styles.navLinksCountainer}>
			<AuthLink>Connexion</AuthLink>
		</div>
	)
}
