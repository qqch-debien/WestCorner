import styles from './authLink.module.css';
import Link from "next/link";

export const AuthLink = ({children, url}) => {
	return(
		<div>
			<Link href={url}>
				<a className={styles.authLink}>{children}</a>
			</Link>
		</div>
	)
}
